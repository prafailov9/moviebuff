package org.ntr.moviebuff.domainmodel.entities.hall;

import java.util.List;
import java.util.Objects;
import org.ntr.moviebuff.domainmodel.entities.screening.Screening;
import org.ntr.moviebuff.domainmodel.entities.seat.Seat;

/**
 *
 * @author Rafailov
 */
public class Hall {
    
    
    private Long id;
    
    private String hallName;
    
    private List<Seat> seats;
    private Screening screening;
    
    public Hall() {
        
        
        
    }
    
    public Hall(Long id, String hallName, List<Seat> seats, Screening screening) {
        this.id = id;
        this.hallName = hallName;
        this.seats = seats;
        this.screening = screening;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHallName() {
        return hallName;
    }

    public void setHallName(String hallName) {
        this.hallName = hallName;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }

    public Screening getScreening() {
        return screening;
    }

    public void setScreening(Screening screening) {
        this.screening = screening;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.id);
        hash = 71 * hash + Objects.hashCode(this.hallName);
        hash = 71 * hash + Objects.hashCode(this.seats);
        hash = 71 * hash + Objects.hashCode(this.screening);
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
        final Hall other = (Hall) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.hallName, other.hallName)) {
            return false;
        }
        if (!Objects.equals(this.seats, other.seats)) {
            return false;
        }
        if (!Objects.equals(this.screening, other.screening)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
    
}
