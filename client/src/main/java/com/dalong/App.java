package com.dalong;

public class App {
    public static void main(String[] args) {
        SqlParser sqlParser = new SqlParser(System.in);
        Token token= sqlParser.getNextToken();
        switch (token.kind) {
            case  SqlParserConstants.NAME:
                System.out.println(token.image);
                break;
            default:
                System.out.println("nothing");
                break;
        }

    }
}
