package net.rdyonline.android_training.orm;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END
/**
 * Entity mapped to table TIMESLOT.
 */
public class Timeslot implements java.io.Serializable {

    private Long id;
    private java.util.Date startTime;
    private java.util.Date endTime;
    private Long speaker;
    private Long room;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public Timeslot() {
    }

    public Timeslot(Long id) {
        this.id = id;
    }

    public Timeslot(Long id, java.util.Date startTime, java.util.Date endTime, Long speaker, Long room) {
        this.id = id;
        this.startTime = startTime;
        this.endTime = endTime;
        this.speaker = speaker;
        this.room = room;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public java.util.Date getStartTime() {
        return startTime;
    }

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    public java.util.Date getEndTime() {
        return endTime;
    }

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    public Long getSpeaker() {
        return speaker;
    }

    public void setSpeaker(Long speaker) {
        this.speaker = speaker;
    }

    public Long getRoom() {
        return room;
    }

    public void setRoom(Long room) {
        this.room = room;
    }

    // KEEP METHODS - put your custom methods here
    // KEEP METHODS END

}
