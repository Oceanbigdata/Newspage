package com.byd.util;

/**
 * Created by Ocean on 2019/10/20.
 */
public class EditorResult {
    private int errno;
    private String[] data;

    public int getErrno() {
        return errno;
    }

    public void setErrno(int errno) {
        this.errno = errno;
    }

    public String[] getData() {
        return data;
    }

    public void setData(String[] data) {
        this.data = data;
    }
}
