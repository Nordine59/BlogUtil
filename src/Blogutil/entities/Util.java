/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Blogutil.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;



/**
 *
 * @author admin
 */
@Entity
public class Util implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
   @OneToMany(mappedBy = "util")
    private List<Page> page = new ArrayList<>(); // page
   
   @OneToMany(mappedBy = "util")
   private List<Article> article = new ArrayList<>();//Articles
   
   @OneToMany(mappedBy = "util")
   private List <Commentaire> commentaire = new ArrayList<>();
   
   @OneToMany(mappedBy = "util")
    private List<Message> message = new ArrayList<>();
    
   @ManyToMany(mappedBy = "util1")
   private List<Message> message1 = new ArrayList<>();
   
   
   
   @OneToOne(mappedBy = "util")
   @JoinColumn(name = "NumSecu_ID")
   private NumSecu numsecu;

    public List<Page> getPage() {
        return page;
    }

    public void setPage(List<Page> page) {
        this.page = page;
    }

    public List<Article> getArticle() {
        return article;
    }

    public void setArticle(List<Article> article) {
        this.article = article;
    }

    public List<Commentaire> getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(List<Commentaire> commentaire) {
        this.commentaire = commentaire;
    }

    public List<Message> getMessage() {
        return message;
    }

    public void setMessage(List<Message> message) {
        this.message = message;
    }

    public List<Message> getMessage1() {
        return message1;
    }

    public void setMessage1(List<Message> message1) {
        this.message1 = message1;
    }

    public NumSecu getNumsecu() {
        return numsecu;
    }

    public void setNumsecu(NumSecu numsecu) {
        this.numsecu = numsecu;
    }
 
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Util)) {
            return false;
        }
        Util other = (Util) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Blogutil.entities.Util[ id=" + id + " ]";
    }
    
}
