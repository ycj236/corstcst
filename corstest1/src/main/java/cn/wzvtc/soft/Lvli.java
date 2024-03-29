package cn.wzvtc.soft;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Lvli {
    public Long getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public String getUrl() {
        return url;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String number;

    private String url;
    public Lvli(){

    }

    public Lvli(String number, String url) {
        this.number = number;
        this.url = url;
    }
}
