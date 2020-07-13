package com.itvenven.service;

public class CommonCalService {

    /**
     * 计算功率
     * @param voltage 电压
     * @param current 电流
     * @return 功率
     */
    public double getPower(double voltage, double current) {
        if (voltage <= 0) {
            return -1;
        }
        if (current <= 0) {
            return -1;
        }
        return voltage * current;
    }
}
