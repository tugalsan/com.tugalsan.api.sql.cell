package com.tugalsan.api.sql.cell.client;

import com.google.gwt.user.client.rpc.IsSerializable;
import com.tugalsan.api.string.client.*;

public class TGS_SQLCellSTR extends TGS_SQLCellAbstract implements IsSerializable {

    @Override
    public TGS_SQLCellSTR cloneIt() {
        return new TGS_SQLCellSTR(valueString);
    }
    private String valueString;

    public String getValueString() {
        return valueString;
    }

    final public void imitateValueString(CharSequence valueString) {
        this.valueString = TGS_StringUtils.toEmptyIfNull(valueString);
    }

    public TGS_SQLCellSTR() {
        this("");
    }

    public TGS_SQLCellSTR(CharSequence valueString) {
        imitateValueString(valueString);
    }

    @Override
    public String toString() {
        return valueString;
    }
}
