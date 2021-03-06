/*
 * This file is generated by jOOQ.
 */
package com.tokenplay.ue4.model.db.tables.records;


import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.tokenplay.ue4.model.db.tables.Tue4GearInstance;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(value = {
    "http://www.jooq.org", "jOOQ version:3.10.6"}, comments = "This class is generated by jOOQ")
@SuppressWarnings({
    "all", "unchecked", "rawtypes"})
public class GearInstanceRecord extends UpdatableRecordImpl<GearInstanceRecord> {

    private static final long serialVersionUID = -39123947;

    /**
     * Setter for <code>tue4_gear_instance.gei_id</code>.
     */
    public void setGeiId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>tue4_gear_instance.gei_id</code>.
     */
    @NotNull
    public String getGeiId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>tue4_gear_instance.gei_gem_id</code>.
     */
    public void setGeiGemId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>tue4_gear_instance.gei_gem_id</code>.
     */
    @NotNull
    public String getGeiGemId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>tue4_gear_instance.gei_pil_id</code>.
     */
    public void setGeiPilId(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>tue4_gear_instance.gei_pil_id</code>.
     */
    @NotNull
    public String getGeiPilId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>tue4_gear_instance.gei_name</code>.
     */
    public void setGeiName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>tue4_gear_instance.gei_name</code>.
     */
    @NotNull
    public String getGeiName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>tue4_gear_instance.gei_default_scheme</code>.
     */
    public void setGeiDefaultScheme(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>tue4_gear_instance.gei_default_scheme</code>.
     */
    public String getGeiDefaultScheme() {
        return (String) get(4);
    }

    /**
     * Setter for <code>tue4_gear_instance.gei_use_custom_scheme</code>.
     */
    public void setGeiUseCustomScheme(Boolean value) {
        set(5, value);
    }

    /**
     * Getter for <code>tue4_gear_instance.gei_use_custom_scheme</code>.
     */
    public Boolean getGeiUseCustomScheme() {
        return (Boolean) get(5);
    }

    /**
     * Setter for <code>tue4_gear_instance.gei_ges_engine</code>.
     */
    public void setGeiGesEngine(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>tue4_gear_instance.gei_ges_engine</code>.
     */
    public String getGeiGesEngine() {
        return (String) get(6);
    }

    /**
     * Setter for <code>tue4_gear_instance.gei_ges_fuel_tank</code>.
     */
    public void setGeiGesFuelTank(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>tue4_gear_instance.gei_ges_fuel_tank</code>.
     */
    public String getGeiGesFuelTank() {
        return (String) get(7);
    }

    /**
     * Setter for <code>tue4_gear_instance.gei_ges_pylon_right</code>.
     */
    public void setGeiGesPylonRight(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>tue4_gear_instance.gei_ges_pylon_right</code>.
     */
    public String getGeiGesPylonRight() {
        return (String) get(8);
    }

    /**
     * Setter for <code>tue4_gear_instance.gei_ges_pylon_left</code>.
     */
    public void setGeiGesPylonLeft(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>tue4_gear_instance.gei_ges_pylon_left</code>.
     */
    public String getGeiGesPylonLeft() {
        return (String) get(9);
    }

    /**
     * Setter for <code>tue4_gear_instance.gei_ges_foot_right</code>.
     */
    public void setGeiGesFootRight(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>tue4_gear_instance.gei_ges_foot_right</code>.
     */
    public String getGeiGesFootRight() {
        return (String) get(10);
    }

    /**
     * Setter for <code>tue4_gear_instance.gei_ges_foot_left</code>.
     */
    public void setGeiGesFootLeft(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>tue4_gear_instance.gei_ges_foot_left</code>.
     */
    public String getGeiGesFootLeft() {
        return (String) get(11);
    }

    /**
     * Setter for <code>tue4_gear_instance.gei_ges_upper_leg_right</code>.
     */
    public void setGeiGesUpperLegRight(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>tue4_gear_instance.gei_ges_upper_leg_right</code>.
     */
    public String getGeiGesUpperLegRight() {
        return (String) get(12);
    }

    /**
     * Setter for <code>tue4_gear_instance.gei_ges_upper_leg_left</code>.
     */
    public void setGeiGesUpperLegLeft(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>tue4_gear_instance.gei_ges_upper_leg_left</code>.
     */
    public String getGeiGesUpperLegLeft() {
        return (String) get(13);
    }

    /**
     * Setter for <code>tue4_gear_instance.gei_ges_lower_leg_right</code>.
     */
    public void setGeiGesLowerLegRight(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>tue4_gear_instance.gei_ges_lower_leg_right</code>.
     */
    public String getGeiGesLowerLegRight() {
        return (String) get(14);
    }

    /**
     * Setter for <code>tue4_gear_instance.gei_ges_lower_leg_left</code>.
     */
    public void setGeiGesLowerLegLeft(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>tue4_gear_instance.gei_ges_lower_leg_left</code>.
     */
    public String getGeiGesLowerLegLeft() {
        return (String) get(15);
    }

    /**
     * Setter for <code>tue4_gear_instance.gei_ges_hand_right</code>.
     */
    public void setGeiGesHandRight(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>tue4_gear_instance.gei_ges_hand_right</code>.
     */
    public String getGeiGesHandRight() {
        return (String) get(16);
    }

    /**
     * Setter for <code>tue4_gear_instance.gei_ges_hand_left</code>.
     */
    public void setGeiGesHandLeft(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>tue4_gear_instance.gei_ges_hand_left</code>.
     */
    public String getGeiGesHandLeft() {
        return (String) get(17);
    }

    /**
     * Setter for <code>tue4_gear_instance.gei_ges_lower_arm_right</code>.
     */
    public void setGeiGesLowerArmRight(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>tue4_gear_instance.gei_ges_lower_arm_right</code>.
     */
    public String getGeiGesLowerArmRight() {
        return (String) get(18);
    }

    /**
     * Setter for <code>tue4_gear_instance.gei_ges_lower_arm_left</code>.
     */
    public void setGeiGesLowerArmLeft(String value) {
        set(19, value);
    }

    /**
     * Getter for <code>tue4_gear_instance.gei_ges_lower_arm_left</code>.
     */
    public String getGeiGesLowerArmLeft() {
        return (String) get(19);
    }

    /**
     * Setter for <code>tue4_gear_instance.gei_ges_upper_arm_right</code>.
     */
    public void setGeiGesUpperArmRight(String value) {
        set(20, value);
    }

    /**
     * Getter for <code>tue4_gear_instance.gei_ges_upper_arm_right</code>.
     */
    public String getGeiGesUpperArmRight() {
        return (String) get(20);
    }

    /**
     * Setter for <code>tue4_gear_instance.gei_ges_upper_arm_left</code>.
     */
    public void setGeiGesUpperArmLeft(String value) {
        set(21, value);
    }

    /**
     * Getter for <code>tue4_gear_instance.gei_ges_upper_arm_left</code>.
     */
    public String getGeiGesUpperArmLeft() {
        return (String) get(21);
    }

    /**
     * Setter for <code>tue4_gear_instance.gei_ges_shoulder_right</code>.
     */
    public void setGeiGesShoulderRight(String value) {
        set(22, value);
    }

    /**
     * Getter for <code>tue4_gear_instance.gei_ges_shoulder_right</code>.
     */
    public String getGeiGesShoulderRight() {
        return (String) get(22);
    }

    /**
     * Setter for <code>tue4_gear_instance.gei_ges_shoulder_left</code>.
     */
    public void setGeiGesShoulderLeft(String value) {
        set(23, value);
    }

    /**
     * Getter for <code>tue4_gear_instance.gei_ges_shoulder_left</code>.
     */
    public String getGeiGesShoulderLeft() {
        return (String) get(23);
    }

    /**
     * Setter for <code>tue4_gear_instance.gei_ges_head</code>.
     */
    public void setGeiGesHead(String value) {
        set(24, value);
    }

    /**
     * Getter for <code>tue4_gear_instance.gei_ges_head</code>.
     */
    public String getGeiGesHead() {
        return (String) get(24);
    }

    /**
     * Setter for <code>tue4_gear_instance.gei_ges_hip</code>.
     */
    public void setGeiGesHip(String value) {
        set(25, value);
    }

    /**
     * Getter for <code>tue4_gear_instance.gei_ges_hip</code>.
     */
    public String getGeiGesHip() {
        return (String) get(25);
    }

    /**
     * Setter for <code>tue4_gear_instance.gei_ges_torso</code>.
     */
    public void setGeiGesTorso(String value) {
        set(26, value);
    }

    /**
     * Getter for <code>tue4_gear_instance.gei_ges_torso</code>.
     */
    public String getGeiGesTorso() {
        return (String) get(26);
    }

    /**
     * Setter for <code>tue4_gear_instance.ii_ges_engine_heavy_mount_left</code>.
     */
    public void setIiGesEngineHeavyMountLeft(String value) {
        set(27, value);
    }

    /**
     * Getter for <code>tue4_gear_instance.ii_ges_engine_heavy_mount_left</code>.
     */
    public String getIiGesEngineHeavyMountLeft() {
        return (String) get(27);
    }

    /**
     * Setter for <code>tue4_gear_instance.ii_ges_engine_heavy_mount_right</code>.
     */
    public void setIiGesEngineHeavyMountRight(String value) {
        set(28, value);
    }

    /**
     * Getter for <code>tue4_gear_instance.ii_ges_engine_heavy_mount_right</code>.
     */
    public String getIiGesEngineHeavyMountRight() {
        return (String) get(28);
    }

    /**
     * Setter for <code>tue4_gear_instance.ii_ges_fuel_tank_storage</code>.
     */
    public void setIiGesFuelTankStorage(String value) {
        set(29, value);
    }

    /**
     * Getter for <code>tue4_gear_instance.ii_ges_fuel_tank_storage</code>.
     */
    public String getIiGesFuelTankStorage() {
        return (String) get(29);
    }

    /**
     * Setter for <code>tue4_gear_instance.ii_ges_left_collar_mount</code>.
     */
    public void setIiGesLeftCollarMount(String value) {
        set(30, value);
    }

    /**
     * Getter for <code>tue4_gear_instance.ii_ges_left_collar_mount</code>.
     */
    public String getIiGesLeftCollarMount() {
        return (String) get(30);
    }

    /**
     * Setter for <code>tue4_gear_instance.ii_ges_right_collar_mount</code>.
     */
    public void setIiGesRightCollarMount(String value) {
        set(31, value);
    }

    /**
     * Getter for <code>tue4_gear_instance.ii_ges_right_collar_mount</code>.
     */
    public String getIiGesRightCollarMount() {
        return (String) get(31);
    }

    /**
     * Setter for <code>tue4_gear_instance.ii_ges_upper_leg_out_left</code>.
     */
    public void setIiGesUpperLegOutLeft(String value) {
        set(32, value);
    }

    /**
     * Getter for <code>tue4_gear_instance.ii_ges_upper_leg_out_left</code>.
     */
    public String getIiGesUpperLegOutLeft() {
        return (String) get(32);
    }

    /**
     * Setter for <code>tue4_gear_instance.ii_ges_upper_leg_out_right</code>.
     */
    public void setIiGesUpperLegOutRight(String value) {
        set(33, value);
    }

    /**
     * Getter for <code>tue4_gear_instance.ii_ges_upper_leg_out_right</code>.
     */
    public String getIiGesUpperLegOutRight() {
        return (String) get(33);
    }

    /**
     * Setter for <code>tue4_gear_instance.gei_bas_id</code>.
     */
    public void setGeiBasId(String value) {
        set(34, value);
    }

    /**
     * Getter for <code>tue4_gear_instance.gei_bas_id</code>.
     */
    @Size(max = 32)
    public String getGeiBasId() {
        return (String) get(34);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GearInstanceRecord
     */
    public GearInstanceRecord() {
        super(Tue4GearInstance.GEAR_INSTANCE);
    }

    /**
     * Create a detached, initialised GearInstanceRecord
     */
    public GearInstanceRecord(String id, String gemId, String pilId, String name, String defaultScheme, Boolean useCustomScheme, String gesEngine,
        String gesFuelTank, String gesPylonRight, String gesPylonLeft, String gesFootRight, String gesFootLeft, String gesUpperLegRight,
        String gesUpperLegLeft, String gesLowerLegRight, String gesLowerLegLeft, String gesHandRight, String gesHandLeft, String gesLowerArmRight,
        String gesLowerArmLeft, String gesUpperArmRight, String gesUpperArmLeft, String gesShoulderRight, String gesShoulderLeft, String gesHead,
        String gesHip, String gesTorso, String iiGesEngineHeavyMountLeft, String iiGesEngineHeavyMountRight, String iiGesFuelTankStorage,
        String iiGesLeftCollarMount, String iiGesRightCollarMount, String iiGesUpperLegOutLeft, String iiGesUpperLegOutRight, String basId) {
        super(Tue4GearInstance.GEAR_INSTANCE);

        set(0, id);
        set(1, gemId);
        set(2, pilId);
        set(3, name);
        set(4, defaultScheme);
        set(5, useCustomScheme);
        set(6, gesEngine);
        set(7, gesFuelTank);
        set(8, gesPylonRight);
        set(9, gesPylonLeft);
        set(10, gesFootRight);
        set(11, gesFootLeft);
        set(12, gesUpperLegRight);
        set(13, gesUpperLegLeft);
        set(14, gesLowerLegRight);
        set(15, gesLowerLegLeft);
        set(16, gesHandRight);
        set(17, gesHandLeft);
        set(18, gesLowerArmRight);
        set(19, gesLowerArmLeft);
        set(20, gesUpperArmRight);
        set(21, gesUpperArmLeft);
        set(22, gesShoulderRight);
        set(23, gesShoulderLeft);
        set(24, gesHead);
        set(25, gesHip);
        set(26, gesTorso);
        set(27, iiGesEngineHeavyMountLeft);
        set(28, iiGesEngineHeavyMountRight);
        set(29, iiGesFuelTankStorage);
        set(30, iiGesLeftCollarMount);
        set(31, iiGesRightCollarMount);
        set(32, iiGesUpperLegOutLeft);
        set(33, iiGesUpperLegOutRight);
        set(34, basId);
    }
}
