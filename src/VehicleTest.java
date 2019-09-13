import org.junit.Test;

class VehicleTest {
    @Test
    void TestVehicle() {
        Vehicle vehicle = new Vehicle(0, 0);
        assertEquals(0, vehicle.position, vehicle.startpoint);

    }

}