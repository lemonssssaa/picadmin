package com.nsw.entity;

import lombok.Data;


@Data
    public class UserVO {
        private String username;
        private String password;
        private String mailbox;

        public UserVO(String username, String password, String mailbox) {
            this.username = username;
            this.password = password;
            this.mailbox = mailbox;
        }
}
