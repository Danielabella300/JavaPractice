package com.ibm.Inventory;
import java.util.Date;

public class ClassicalCD extends Item{
    private String composer;
    private String[] performers = new String[5];
    private String recordingLocation;
    private Date releaseDate;
    private int performerCount = 0;

    public void addPerformeer(String performer)
    {
        if(performerCount < performers.length)
        {
            performers [performerCount++] = performer;
        }
        else 
        {
            System.out.println("Cannot add more to " + getTitle());
        }
    }

    public void showPerformers()
    {
        if(performerCount > 0)
        {
            for (int i = 0; i < performerCount; i++)
            {
                System.out.println(performers[i]);
            }
        }
    }

    public ClassicalCD(String title, double price, int quantity, String composer, String[] performers,
            String recordingLocation, Date releaseDate) 
    {
        super(title, price, quantity);
        setComposer(composer);
        setPerformers(performers);
        setRecordingLocation(recordingLocation);
        setReleaseDate(releaseDate);
    }

    public String getComposer() 
    {
        return composer;
    }
    public void setComposer(String composer) 
    {
        this.composer = composer;
    }
    public String[] getPerformers() 
    {
        return performers;
    }
    public void setPerformers(String[] performers) 
    {
        this.performers = performers;
    }
    public String getRecordingLocation() 
    {
        return recordingLocation;
    }
    public void setRecordingLocation(String recordingLocation)
    {
        this.recordingLocation = recordingLocation;
    }
    public Date getReleaseDate() 
    {
        return releaseDate;
    }
    public void setReleaseDate(Date releaseDate) 
    {
        this.releaseDate = releaseDate;
    }

    
    
}
