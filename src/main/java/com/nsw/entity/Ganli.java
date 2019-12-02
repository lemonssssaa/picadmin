package com.nsw.entity;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ganli {
        Integer id;
        String username;

        public Integer getActive_status() {
                return active_status;
        }

        public void setActive_status(Integer active_status) {
                this.active_status = active_status;
        }

        Integer active_status;



        String email;

        public String getEmail() {
                return email;
        }

        public void setEmail(String email) {
                this.email = email;
        }

        public Integer getId() {
                return id;
        }

        public void setId(Integer id) {
                this.id = id;
        }

        public String getUsername() {
                return username;
        }

        public void setUsername(String username) {
                this.username = username;
        }


}
