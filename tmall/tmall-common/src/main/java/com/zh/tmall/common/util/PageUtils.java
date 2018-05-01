package com.zh.tmall.common.util;

/**
 * 分页工具类
 */
public class PageUtils {

    private boolean hasPreviouse; // 是否存在上一页
    private boolean hasNext;       // 是否存在下一页

    private Integer start;           // 起始页
    private Integer last;            // 尾页

    private Integer index;           // 当前页面下标
    private Integer count;           // 总数量
    private String param;           // 页面参数
    private Integer totalPage;       // 总页数

    public boolean isHasPreviouse() {
        return hasPreviouse;
    }

    public void setHasPreviouse(boolean hasPreviouse) {
        this.hasPreviouse = hasPreviouse;
    }

    public boolean isHasNext() {
        return hasNext;
    }

    public void setHasNext(boolean hasNext) {
        this.hasNext = hasNext;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getLast() {
        return last;
    }

    public void setLast(int last) {
        this.last = last;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }
}
