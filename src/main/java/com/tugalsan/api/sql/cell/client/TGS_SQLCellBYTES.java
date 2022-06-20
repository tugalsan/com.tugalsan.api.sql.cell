package com.tugalsan.api.sql.cell.client;

import com.google.gwt.user.client.rpc.*;

public class TGS_SQLCellBYTES extends TGS_SQLCellAbstract implements IsSerializable {

    @Override
    public TGS_SQLCellBYTES cloneIt() {
        return new TGS_SQLCellBYTES(valueBytes);
    }

    private byte[] valueBytes;

    public byte[] getValueBytes() {
        return valueBytes;
    }

    public void imitateValueBytes(byte[] valueBytes) {
        this.valueBytes = valueBytes;
    }

    public TGS_SQLCellBYTES() {
        this(null);
    }

    public TGS_SQLCellBYTES(byte[] valueBytes) {
        this.valueBytes = valueBytes;
    }

    @Override
    public String toString() {
        return null;
    }
}
