package com.groupsix.freightlogisticssystem.common.util;


import java.io.IOException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.groupsix.freightlogisticssystem.common.entity.ResponseEntity;

/**
 * json处理工具
 * 
 * @author zh
 */
public class JsonUtils {
	
	private final static Logger LOG = LogManager.getLogger(JsonUtils.class);
	
	//jackson对象
	private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
	
	/**
	 * 将json字符串转换成Object 对象
	 * @param json
	 * @return
	 */
	public static Object toObject(String jsonString) {
		return toObject(jsonString, Object.class);
	}
	
	/**
	 * 根据给定的 T 类型,将json字符串转换成 T 类型
	 * @param json
	 * @param clazz 
	 * @return
	 */
	public static <T>  T toObject(String jsonString, Class<T> clazz) {
		try {
			return OBJECT_MAPPER.readValue(jsonString, clazz);
		} catch (IOException e) {
			e.printStackTrace();
			LOG.error("JSON to object faild ", e);
		}
		return null;
	}
	
	/**
	 * 将Object转换成JSON字符串
	 * 
	 * @param obj Obj
	 * @return JSON字符串 
	 */
	public static String toJSON(Object obj) {
		OBJECT_MAPPER.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
		try {
			OBJECT_MAPPER.writeValueAsString(obj);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			LOG.error("Object to json faild ", e);
		}
		return "";
	}
	
	/**
	 * 将json字符串转换成集合类型,根据给定的 T 确定类型
	 * @param jsonString
	 * @param clazz T 类型
	 * @return List<T> 对象
	 */
	public static <T> List<T> toList(String jsonString,Class<T> clazz) {
		List<T> list = null;
		try {
			list = OBJECT_MAPPER.readValue(jsonString, 
					OBJECT_MAPPER.getTypeFactory().constructCollectionType(List.class, clazz));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	
	
	/**
	 * 将readResponseEntityJSON字符串转换成ReadResponseEntity
	 * @param responseEntityJSONString
	 * @param clazz	responseEntity data of type
	 * @return
	 */
	public static <T> T  readResponseEntityJSONData(String responseEntityJSONString, Class<T> clazz) {
		T obj = null;
		try {
			JsonNode jsonNode = OBJECT_MAPPER.readTree(responseEntityJSONString);
			JsonNode data = jsonNode.get("data");
			
            if (clazz != null) {
                if ( data.isObject() ) {
                    obj = OBJECT_MAPPER.readValue(data.traverse(), clazz);
                } else if ( data.isTextual() ) {
                    obj = OBJECT_MAPPER.readValue(data.asText(), clazz);
                } else if (data.isArray() && data.size() > 0) {
                    obj = OBJECT_MAPPER.readValue(data.traverse(),
                    		OBJECT_MAPPER.getTypeFactory().constructCollectionType(List.class, clazz));
                }
            }
            ResponseEntity.build(jsonNode.get("state").asText(), jsonNode.get("msg").asText(), obj);
		} catch (IOException e) {
			LOG.error("" + e);
			e.printStackTrace();
		}
		
		return obj;
	}
}
