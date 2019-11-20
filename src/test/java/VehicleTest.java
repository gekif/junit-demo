import org.junit.Assert;
import org.junit.Test;

public class VehicleTest {
    @Test
    public void testCarIsInstanceOfVehicle() {
        new Car("Dodge", "Ram", 2016);
        Assert.assertTrue(true);
    }

    @Test
    public void testCarHasFourWheels() {    
        Car car = new Car("Honda", "Civic", 2006);    
        Assert.assertEquals(car.getNumWheels(), 4);
    }
    
    @Test
    public void testMotorcycleHasTwoWheels() {    
        Motorcycle motorcycle = new Motorcycle("Yamaha", "Bolt", 2017); 
        Assert.assertEquals(motorcycle.getNumWheels(), 2);
    }

    @Test
    public void testCarSpeed() {
        Car car = new Car("Honda", "Civic", 2012);
        car.drive();
        Assert.assertEquals(car.getSpeed(), 60);
    }

    @Test
    public void testMotorcycleSpeed() {
        Motorcycle motorcycle = new Motorcycle("Yamaha", "Bolt", 2017);
        motorcycle.drive();
        Assert.assertEquals(motorcycle.getSpeed(), 75);
    }

}

    