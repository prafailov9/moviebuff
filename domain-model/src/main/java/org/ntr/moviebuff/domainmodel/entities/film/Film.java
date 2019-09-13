package org.ntr.moviebuff.domainmodel.entities.film;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import org.ntr.moviebuff.domainmodel.entities.screening.Screening;

/**
 *
 * @author Rafailov
 */
public class Film {
    
    private Long id;
    private String filmName;
    private String filmDescription;
    private LocalDateTime premiereDate;
    
    private List<Screening> screenings;

    public Film() {
        
        
        
    }
    
    public Film(Long id, String filmName, String filmDescription, LocalDateTime premiereDate, List<Screening> screenings) {
        this.id = id;
        this.filmName = filmName;
        this.filmDescription = filmDescription;
        this.premiereDate = premiereDate;
        this.screenings = screenings;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public String getFilmDescription() {
        return filmDescription;
    }

    public void setFilmDescription(String filmDescription) {
        this.filmDescription = filmDescription;
    }

    public LocalDateTime getPremiereDate() {
        return premiereDate;
    }

    public void setPremiereDate(LocalDateTime premiereDate) {
        this.premiereDate = premiereDate;
    }

    public List<Screening> getScreenings() {
        return screenings;
    }

    public void setScreenings(List<Screening> screenings) {
        this.screenings = screenings;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.id);
        hash = 83 * hash + Objects.hashCode(this.filmName);
        hash = 83 * hash + Objects.hashCode(this.filmDescription);
        hash = 83 * hash + Objects.hashCode(this.premiereDate);
        hash = 83 * hash + Objects.hashCode(this.screenings);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Film other = (Film) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.filmName, other.filmName)) {
            return false;
        }
        if (!Objects.equals(this.filmDescription, other.filmDescription)) {
            return false;
        }
        if (!Objects.equals(this.premiereDate, other.premiereDate)) {
            return false;
        }
        if (!Objects.equals(this.screenings, other.screenings)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
