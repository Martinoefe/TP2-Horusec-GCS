package com.chess.game.utils;

public class FakeCreds {
    // ❌ Credenciales de AWS hardcodeadas (Horusec-leaks suele marcarlas CRITICAL)
    private static final String AWS_ACCESS_KEY_ID = "AKIAIOSFODNN7EXAMPLE";
    private static final String AWS_SECRET_ACCESS_KEY = "wJalrXUtnFEMI/K7MDENG/bPxRfiCYEXAMPLEKEY";

    public static void main(String[] args) {
        System.out.println("Credenciales demo, NO reales.");
    }
}


