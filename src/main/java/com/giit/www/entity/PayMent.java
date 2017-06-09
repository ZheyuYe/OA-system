package com.giit.www.entity;

public class PayMent {
    int payment_id;
    String apply_name;
    String handle_name;
    String apply_reason;
    String apply_money;
    String handle_time;
    String handle_state;

    public int getId() {
        return payment_id;
    }

    public void setId(int payment_id) {
        this.payment_id = payment_id;
    }

    public String getApply_name() {
        return apply_name;
    }

    public void setApply_name(String apply_name) {
        this.apply_name = apply_name;
    }

    public String getHandle_name() {
        return handle_name;
    }

    public void setHandle_name(String handle_name) {
        this.handle_name = handle_name;
    }

    public String getApply_reason() {
        return apply_reason;
    }

    public void setApply_reason(String apply_reason) {
        this.apply_reason = apply_reason;
    }

    public String getApply_money() {
        return apply_money;
    }

    public void setApply_money(String apply_money) {
        this.apply_money = apply_money;
    }

    public String getHandle_time() {
        return handle_time;
    }

    public void setHandle_time(String handle_time) {
        this.handle_time = handle_time;
    }

    public String getHandle_state() {
        return handle_state;
    }

    public void setHandle_state(String handle_state) {
        this.handle_state = handle_state;
    }
}
