package com.apache.corahdb.core.model.options;

/**
 * @author zhaozhenhang <zhaozhenhang@kuaishou.com>
 * Created on 2022-08-07
 */
public class WriteOptions {

    private boolean sendDiscard;

    public boolean isSendDiscard() {
        return sendDiscard;
    }

    public void setSendDiscard(boolean sendDiscard) {
        this.sendDiscard = sendDiscard;
    }
}
