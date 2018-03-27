package br.edu.ifpb.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 27/03/2018, 13:47:58
 */
@Entity
@XmlRootElement
public class News implements Serializable {

    @Id
    @GeneratedValue
    private int id;
    private String title;
    private String body;
    private String auth;

    public News() {
    }

    public News(String title, String body, String auth) {
        this.title = title;
        this.body = body;
        this.auth = auth;
    }

    public News(int id, String title, String body, String auth) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.auth = auth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAuth() {
        return auth;
    }

    public void setAuth(String auth) {
        this.auth = auth;
    }

}
