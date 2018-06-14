package mw.sda.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "film", schema = "sakila")
public class Film {
    @GeneratedValue
    @Id
    @Column(name = "film_id", nullable = false)
    private short id;

    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }


    @Basic
    @Column(name = "title")
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    @Basic
    @Column(name = "description")
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    @Basic
    @Column(name = "length")
    private short length;

    public short getLength() {
        return length;
    }

    public void setLength(short length) {
        this.length = length;
    }


    @Basic
    @Column(name = "rental_rate")
    private double rentalRate;

    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }

    @Override
    public String toString() {
        return "Film{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", length=" + length +
                ", rentalRate=" + rentalRate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Film)) return false;
        Film film = (Film) o;
        return getLength() == film.getLength();
    }

    @Override
    public int hashCode() {

        return Objects.hash(getLength());
    }
}
