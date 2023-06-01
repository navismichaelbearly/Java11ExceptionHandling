package com.exceptions.m2;

public class TryCatchFlowTwo {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String str = null;
        try {
            sb.append("a");
            str.toLowerCase();
            sb.append("b");
        } catch (IllegalArgumentException e) {
            sb.append("c");
        } catch (Exception e) {
            sb.append("d");
        } finally {
            sb.append("e");
        }
        System.out.println(sb);

    }
}
