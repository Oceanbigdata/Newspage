package com.byd.entity;

/**
 * 角色实体类
 */
public class Role {

        private int roleId;//角色ID
        private String roleName;//角色名称
        private int number;//用户工号

        public Role() {
        }

        public Role(int roleId, String roleName, int number) {
            this.roleId = roleId;
            this.roleName = roleName;
            this.number = number;
        }

        public int getRoleId() {
            return roleId;
        }

        public void setRoleId(int roleId) {
            this.roleId = roleId;
        }

        public String getRoleName() {
            return roleName;
        }

        public void setRoleName(String roleName) {
            this.roleName = roleName;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        @Override
        public String toString() {
            return "role{" +
                "roleId=" + roleId +
                ", roleName='" + roleName + '\'' +
                ", number=" + number +
                '}';
        }
    }

