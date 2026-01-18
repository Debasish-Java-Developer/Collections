package com.Employee.codePractice;

public class AddTwoNumbers {
    public static void main(String[] args) {
        int [] arr ={2,3,5,9,4,7,0,6,12,10,13,16};
        int target = 15;
        for (int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++){
                if (arr[i] + arr[j] == target){
                    System.out.println("Pair found: (" + arr[i] + ", " + arr[j] + ")");
                }
            }
        }
        for (int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++){
                for (int k=j+1; k<arr.length; k++){
                    if (arr[i] + arr[j] + arr[k] ==target){
                        System.out.println("Triplet found: (" + arr[i] + ", " + arr[j] + ", " + arr[k] + ")");
                    }
                }
            }
        }
    }
}
