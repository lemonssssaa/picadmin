package com.nsw.dirs;

import javax.persistence.*;
import java.util.Objects;

@Entity
@IdClass(RelationshipPK.class)
public class Relationship {

    private String to_user_id;
    private String from_user_id;

    public Relationship() {
    }

    public Relationship(String to_user_id, String from_user_id) {
        this.to_user_id = to_user_id;
        this.from_user_id = from_user_id;
    }

    @Id
    public String getTo_user_id() {
        return to_user_id;
    }

    public void setTo_user_id(String to_user_id) {
        this.to_user_id = to_user_id;
    }

    @Id
    public String getFrom_user_id() {
        return from_user_id;
    }

    public void setFrom_user_id(String from_user_id) {
        this.from_user_id = from_user_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Relationship that = (Relationship) o;
        if (!Objects.equals(from_user_id, that.from_user_id)) return false;
        return Objects.equals(to_user_id, that.to_user_id);
    }
    @Override
    public int hashCode() {
        int result = from_user_id != null ? from_user_id.hashCode() : 0;
        result = 31 * result + (to_user_id != null ? to_user_id.hashCode() : 0);
        return result;
    }
}
