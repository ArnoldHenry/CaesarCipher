class GetProperties {
    private String mcipherText,mreplaceVal;
    private Integer mcharPosition,mkeyval,mchosenInt;
    public GetProperties(int charPosition,int keyval,int chosenInt,String cipherText,String replaceVal){
        mcharPosition  = charPosition;
        mkeyval = keyval;
        mchosenInt  = chosenInt;
        mcipherText  = cipherText;
        mreplaceVal  = replaceVal;
    }
    public int getcharPosition(){
        return mcharPosition;
    }
    public int getkeyval(){
        return mkeyval;
    }
    public int getchosenInt(){
        return mchosenInt;
    }
    public String getcipherText(){
        return mcipherText;
    }

}
