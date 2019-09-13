package org.ntr.moviebuff.domainmodel.entities.screening;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import org.ntr.moviebuff.domainmodel.entities.film.Film;

/**
 *
 * @author Rafailov
 */
public class Screening {
    
    private Long id;
    
    private List<LocalDateTime> screeningDates;

    private Film film;

    public Screening() {
        
    }
    
    public Screening(Long id, List<LocalDateTime> screeningDates, Film film) {
        this.id = id;
        this.screeningDates = screeningDates;
        this.film = film;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<LocalDateTime> getScreeningDates() {
        return screeningDates;
    }

    public void setScreeningDates(List<LocalDateTime> screeningDates) {
        this.screeningDates = screeningDates;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.id);
        hash = 79 * hash + Objects.hashCode(this.screeningDates);
        hash = 79 * hash + Objects.hashCode(this.film);
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
        final Screening other = (Screening) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.screeningDates, other.screeningDates)) {
            return false;
        }
        if (!Objects.equals(this.film, other.film)) {
            return false;
        }
        return true;
    }
    
    
    
}
