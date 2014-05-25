package org.janvs.util;

public class Booleans {

    public static boolean[] getBooleanRepresentationFor(final int value, final int numberOfPlaces) {
        String binary = getBinaryStringOfProperSize(value, numberOfPlaces);
        final boolean[] booleans = convertToBooleans(binary);
        return booleans;
    }

    static private String getBinaryStringOfProperSize(final int value, final int numberOfPlaces) {
        String binary = Integer.toBinaryString(value);
        if (binary.length() < numberOfPlaces) {
            binary = padWithZeros(binary, numberOfPlaces);
        }
        return binary;
    }

    static private boolean[] convertToBooleans(final String binary) {
        final char[] binaryArray = binary.toCharArray();
        final boolean[] booleans = new boolean[binaryArray.length];
        for (int i = 0; i < binary.length(); i++)
            booleans[i] = binaryArray[i] == '1' ? true : false;
        return booleans;
    }

    static private String padWithZeros(String binary, final double numberOfPlaces) {
        for (int i = 0; i < numberOfPlaces - binary.length(); i++) {
            binary = "0" + binary;
        }
        return binary;
    }
}
