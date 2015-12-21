public class mainStarter {
    public static void main(String[] args) {

        // width of 8 (1 byte)
        byte minByteValue = -128;
        byte maxByteValue = 127;
        byte byteValueCalc = (byte) (maxByteValue/2);   // casting to a correct type;

        // width of 16 (2 bytes)
        short minShortValue = -32_768;
        short maxShortValue = 32_767;

        // width of 32 (4 bytes)
        int minValue = -2_147_483_648;
        int maxValue = 2_147_483_647;

        // width of 64 (8 bytes)
        long minLongValue = -9_223_372_036_854_775_808L;
        long maxLongValue = 9_223_372_036_854_775_807L;

        // width of 32
        float floatValue = 5f/3;
        // width of 64
        double doubleValue = 5d/3;
        System.out.println(floatValue + "\n" + doubleValue);

        // width of 16
        char myChar = 'a';
        String myString = "My string";

        boolean clientAnswer = true;
        boolean clientEntered = (clientAnswer) ? true : false;

    }


}
