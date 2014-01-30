package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * @author tombisnis@yahoo.com
 */
@Entity
public class Vehicle {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int vihicleId;
    private String vihicleName;

    @ManyToOne
    private UserDetails userDetails;
    
    public int getVihicleId() {
        return vihicleId;
    }

    public void setVihicleId(int vihicleId) {
        this.vihicleId = vihicleId;
    }

    public String getVihicleName() {
        return vihicleName;
    }

    public void setVihicleName(String vihicleName) {
        this.vihicleName = vihicleName;
    }

    public UserDetails getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(UserDetails userDetails) {
        this.userDetails = userDetails;
    }
}