package org.example.Leetcode;

public class MakeBinary {
    public static void main(String[] args) {
        String[] ipAddress1 = makeBinary("131.189.15.6");
        String[] ipAddress2 = makeBinary("131.173.216.56");
        String[] subnetMask = makeBinary("255.248.0.0");

//        String[] ipAddress1 = makeBinary("94.235.16.59");
//        String[] ipAddress2 = makeBinary("94.235.23.40");
//        String[] subnetMask = makeBinary("255.255.240.0");

        boolean inSameSubnet = inSameSubnet(ipAddress1, ipAddress2, subnetMask);
        System.out.println("Both IP addresses are in the same subnet: " + inSameSubnet);
    }

    private static String[] makeBinary(String ipAddress){
        String [] numbers = ipAddress.split("\\.");
        String [] answer = new String[numbers.length];
        for(int i = 0; i < numbers.length; i++){
            answer[i] = String.format("%8s", Integer.toBinaryString(Integer.parseInt(numbers[i]))).replace(' ', '0');
        }
        return answer;
    }

    private static boolean inSameSubnet(String[] ipAddress1, String[] ipAddress2, String[] subnetMask){
        for (int i = 0; i < ipAddress1.length; i++) {
            int ipOctet1 = Integer.parseInt(ipAddress1[i], 2);
            int ipOctet2 = Integer.parseInt(ipAddress2[i], 2);
            int maskOctet = Integer.parseInt(subnetMask[i], 2);

            // Perform bitwise AND operation on each octet of IP addresses and subnet mask
            int networkOctet1 = ipOctet1 & maskOctet;
            int networkOctet2 = ipOctet2 & maskOctet;

            // Check if network portions are equal
            if (networkOctet1 != networkOctet2) {
                return false;
            }
        }
        return true;
    }
}
