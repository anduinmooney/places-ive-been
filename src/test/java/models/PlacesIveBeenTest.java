package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlacesIveBeenTest {
    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void NewPlaceObjectGetsCorrectlyCreated_true() throws Exception {
        PlacesIveBeen placesIveBeen = new PlacesIveBeen("location", "date", "description");
        assertEquals(true, placesIveBeen instanceof PlacesIveBeen);
    }

    @Test
    public void PlaceInstantiatesWithLocation_true() throws Exception {
        PlacesIveBeen placesIveBeen = new PlacesIveBeen("location", "date", "description");
        assertEquals("location", placesIveBeen.getLocation());

    }

    @Test
    public void PlaceInstantiatesWithDate_true() throws Exception {
        PlacesIveBeen placesIveBeen = new PlacesIveBeen("location", "date", "description");
        assertEquals("date", placesIveBeen.getDate());

    }

    @Test
    public void PlaceInstantiatesWithDescription_true() throws Exception {
        PlacesIveBeen placesIveBeen = new PlacesIveBeen("location", "date", "description");
        assertEquals("description", placesIveBeen.getDescription());

    }

    @After
    public void tearDown() {
        PlacesIveBeen.clearAllPosts(); //clear out allll the posts before each test.
    }

    @Test
    public void AllPlacesAreCorrectlyReturned_true() {
        PlacesIveBeen placesIveBeen = new PlacesIveBeen("location", "date", "description");
        PlacesIveBeen otherPlacesIveBeen = new PlacesIveBeen ("Alabama", "12-07-2018", "Went to Alabama.");
        assertEquals(2, PlacesIveBeen.getAll().size());
    }

    @Test
    public void AllPlacesContainsAllPlaces_true() {
        PlacesIveBeen placesIveBeen = new PlacesIveBeen("location", "date", "description");
        PlacesIveBeen otherPlacesIveBeen = new PlacesIveBeen ("Alabama", "12-07-2018", "Went to Alabama.");
        assertTrue(PlacesIveBeen.getAll().contains(placesIveBeen));
        assertTrue(PlacesIveBeen.getAll().contains(otherPlacesIveBeen));
    }
}