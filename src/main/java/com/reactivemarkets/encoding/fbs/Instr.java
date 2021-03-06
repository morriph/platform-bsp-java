// automatically generated by the FlatBuffers compiler, do not modify

package com.reactivemarkets.encoding.fbs;

import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

@SuppressWarnings("unused")
public final class Instr extends Table {
    public static Instr getRootAsInstr(ByteBuffer _bb) {
        return getRootAsInstr(_bb, new Instr());
    }

    public static Instr getRootAsInstr(ByteBuffer _bb, Instr obj) {
        _bb.order(ByteOrder.LITTLE_ENDIAN);
        return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb));
    }

    public static int createInstr(FlatBufferBuilder builder,
                                  int id,
                                  int symbolOffset,
                                  int displayOffset,
                                  int descriptionOffset,
                                  int base_assetOffset,
                                  int term_ccyOffset,
                                  int tenorOffset,
                                  short asset_type,
                                  short instr_type,
                                  short settl_type,
                                  short pip_dp,
                                  short pip_digits) {
        builder.startObject(12);
        Instr.addTenor(builder, tenorOffset);
        Instr.addTermCcy(builder, term_ccyOffset);
        Instr.addBaseAsset(builder, base_assetOffset);
        Instr.addDescription(builder, descriptionOffset);
        Instr.addDisplay(builder, displayOffset);
        Instr.addSymbol(builder, symbolOffset);
        Instr.addId(builder, id);
        Instr.addPipDigits(builder, pip_digits);
        Instr.addPipDp(builder, pip_dp);
        Instr.addSettlType(builder, settl_type);
        Instr.addInstrType(builder, instr_type);
        Instr.addAssetType(builder, asset_type);
        return Instr.endInstr(builder);
    }

    public static void startInstr(FlatBufferBuilder builder) {
        builder.startObject(12);
    }

    public static void addId(FlatBufferBuilder builder, int id) {
        builder.addInt(0, id, 0);
    }

    public static void addSymbol(FlatBufferBuilder builder, int symbolOffset) {
        builder.addOffset(1, symbolOffset, 0);
    }

    public static void addDisplay(FlatBufferBuilder builder, int displayOffset) {
        builder.addOffset(2, displayOffset, 0);
    }

    public static void addDescription(FlatBufferBuilder builder, int descriptionOffset) {
        builder.addOffset(3, descriptionOffset, 0);
    }

    public static void addBaseAsset(FlatBufferBuilder builder, int baseAssetOffset) {
        builder.addOffset(4, baseAssetOffset, 0);
    }

    public static void addTermCcy(FlatBufferBuilder builder, int termCcyOffset) {
        builder.addOffset(5, termCcyOffset, 0);
    }

    public static void addTenor(FlatBufferBuilder builder, int tenorOffset) {
        builder.addOffset(6, tenorOffset, 0);
    }

    public static void addAssetType(FlatBufferBuilder builder, short assetType) {
        builder.addShort(7, assetType, 0);
    }

    public static void addInstrType(FlatBufferBuilder builder, short instrType) {
        builder.addShort(8, instrType, 0);
    }

    public static void addSettlType(FlatBufferBuilder builder, short settlType) {
        builder.addShort(9, settlType, 0);
    }

    public static void addPipDp(FlatBufferBuilder builder, short pipDp) {
        builder.addShort(10, pipDp, 0);
    }

    public static void addPipDigits(FlatBufferBuilder builder, short pipDigits) {
        builder.addShort(11, pipDigits, 2);
    }

    public static int endInstr(FlatBufferBuilder builder) {
        int o = builder.endObject();
        builder.required(o, 6);  // symbol
        builder.required(o, 8);  // display
        builder.required(o, 10);  // description
        builder.required(o, 12);  // base_asset
        builder.required(o, 14);  // term_ccy
        return o;
    }

    public void __init(int _i, ByteBuffer _bb) {
        bb_pos = _i;
        bb = _bb;
        vtable_start = bb_pos - bb.getInt(bb_pos);
        vtable_size = bb.getShort(vtable_start);
    }

    public Instr __assign(int _i, ByteBuffer _bb) {
        __init(_i, _bb);
        return this;
    }

    public int id() {
        int o = __offset(4);
        return o != 0 ? bb.getInt(o + bb_pos) : 0;
    }

    public String symbol() {
        int o = __offset(6);
        return o != 0 ? __string(o + bb_pos) : null;
    }

    public ByteBuffer symbolAsByteBuffer() {
        return __vector_as_bytebuffer(6, 1);
    }

    public ByteBuffer symbolInByteBuffer(ByteBuffer _bb) {
        return __vector_in_bytebuffer(_bb, 6, 1);
    }

    public String display() {
        int o = __offset(8);
        return o != 0 ? __string(o + bb_pos) : null;
    }

    public ByteBuffer displayAsByteBuffer() {
        return __vector_as_bytebuffer(8, 1);
    }

    public ByteBuffer displayInByteBuffer(ByteBuffer _bb) {
        return __vector_in_bytebuffer(_bb, 8, 1);
    }

    public String description() {
        int o = __offset(10);
        return o != 0 ? __string(o + bb_pos) : null;
    }

    public ByteBuffer descriptionAsByteBuffer() {
        return __vector_as_bytebuffer(10, 1);
    }

    public ByteBuffer descriptionInByteBuffer(ByteBuffer _bb) {
        return __vector_in_bytebuffer(_bb, 10, 1);
    }

    public String baseAsset() {
        int o = __offset(12);
        return o != 0 ? __string(o + bb_pos) : null;
    }

    public ByteBuffer baseAssetAsByteBuffer() {
        return __vector_as_bytebuffer(12, 1);
    }

    public ByteBuffer baseAssetInByteBuffer(ByteBuffer _bb) {
        return __vector_in_bytebuffer(_bb, 12, 1);
    }

    public String termCcy() {
        int o = __offset(14);
        return o != 0 ? __string(o + bb_pos) : null;
    }

    public ByteBuffer termCcyAsByteBuffer() {
        return __vector_as_bytebuffer(14, 1);
    }

    public ByteBuffer termCcyInByteBuffer(ByteBuffer _bb) {
        return __vector_in_bytebuffer(_bb, 14, 1);
    }

    public String tenor() {
        int o = __offset(16);
        return o != 0 ? __string(o + bb_pos) : null;
    }

    public ByteBuffer tenorAsByteBuffer() {
        return __vector_as_bytebuffer(16, 1);
    }

    public ByteBuffer tenorInByteBuffer(ByteBuffer _bb) {
        return __vector_in_bytebuffer(_bb, 16, 1);
    }

    public short assetType() {
        int o = __offset(18);
        return o != 0 ? bb.getShort(o + bb_pos) : 0;
    }

    public short instrType() {
        int o = __offset(20);
        return o != 0 ? bb.getShort(o + bb_pos) : 0;
    }

    public short settlType() {
        int o = __offset(22);
        return o != 0 ? bb.getShort(o + bb_pos) : 0;
    }

    public short pipDp() {
        int o = __offset(24);
        return o != 0 ? bb.getShort(o + bb_pos) : 0;
    }

    public short pipDigits() {
        int o = __offset(26);
        return o != 0 ? bb.getShort(o + bb_pos) : 2;
    }
}

