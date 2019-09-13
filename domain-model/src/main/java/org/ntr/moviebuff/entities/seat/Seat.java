package org.ntr.moviebuff.entities.seat;

import java.util.Objects;
import org.ntr.moviebuff.entities.hall.Hall;

/**
 *
 * @author Rafailov
 */
public class Seat {
    
    private Long id;
    
    private boolean reserved;
    
    private Hall hall;
    
    public Seat() {
        
        
        
    }
    
    public Seat(Long id, boolean reserved, Hall hall) {
        this.id = id;
        this.reserved = reserved;
        this.hall = hall;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isReserved() {
        return reserved;
    }

    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }

    public Hall getHall() {
        return hall;
    }

    public void setHall(Hall hall) {
        this.hall = hall;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.id);
        hash = 83 * hash + (this.reserved ? 1 : 0);
        hash = 83 * hash + Objects.hashCode(this.hall);
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
        final Seat other = (Seat) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (this.reserved != other.reserved) {
            return false;
        }
        if (!Objects.equals(this.hall, other.hall)) {
            return false;
        }
        return true;
    }
    
    
    
}
