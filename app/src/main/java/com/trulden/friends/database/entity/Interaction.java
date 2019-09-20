package com.trulden.friends.database.entity;

import androidx.room.ForeignKey;
import androidx.room.Ignore;
import androidx.room.Index;
import androidx.room.PrimaryKey;

import static androidx.room.ForeignKey.CASCADE;

@androidx.room.Entity(tableName = "interaction_table",

        foreignKeys = {
        @ForeignKey(entity = InteractionType.class,
                    parentColumns = "id",
                    childColumns = "interactionTypeId",
                    onDelete = CASCADE)
        },

        indices =
        @Index(value = "interactionTypeId")
)

public class Interaction implements Entity {

    @PrimaryKey(autoGenerate = true)
    private long id;

    private long interactionTypeId;

    private long date;

    private String comment;

    private String friendNames;

    public Interaction(long interactionTypeId, long date, String comment, String friendNames) {
        this.interactionTypeId = interactionTypeId;
        this.date = date;
        this.comment = comment;
        this.friendNames = friendNames;
    }

    @Ignore
    public Interaction(long id, long interactionTypeId, long date, String comment, String friendNames) {
        this.id = id;
        this.interactionTypeId = interactionTypeId;
        this.date = date;
        this.comment = comment;
        this.friendNames = friendNames;
    }

    // -----------------------------------------
    // Getters and setters
    // -----------------------------------------

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getInteractionTypeId() {
        return interactionTypeId;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public String getComment() {
        return comment;
    }

    public String getFriendNames() {
        return friendNames;
    }
}
