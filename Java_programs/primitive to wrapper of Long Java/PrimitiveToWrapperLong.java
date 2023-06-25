public class PrimitiveToWrapperLong {

    public long pLongValue = 982734921734l;
    public String sLongValue = "098127349812374";

    public Long getWrapperFromPrimitive(){
        return Long.valueOf(pLongValue);
    }
    public String getWrapperBinaryFromPrimitive(){
        return Long.toBinaryString(pLongValue);
    }

    public String getWrapperHexFromPrimitive(){
        return Long.toHexString(pLongValue);
    }


}