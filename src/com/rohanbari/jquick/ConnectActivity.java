package com.rohanbari.jquick;

import java.util.Scanner;

/**
 * The connector activity tries to detect the type of the IP address initially.
 * It verifies if the IP address is of type: localhost, private or public.
 *
 * Unused in Commit 4
 *
 * @author Rohan
 */
class ConnectActivity {
    public static int connect() {
        String value;

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter the IP address: ");
            value = scanner.next();
        }

        return value.equals("127.0.0.1") ? 100 :
                value.contains("172.16") ||
                        value.contains(("192.")) ? 1 : 0;
    }
}
