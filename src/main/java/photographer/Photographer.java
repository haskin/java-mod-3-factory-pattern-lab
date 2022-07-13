package photographer;


import camera.Camera;
import camera.CameraFactory;

//  x A private Camera object.
//  x A constructor that initializes the internal instance of Camera with the right type of camera from our Enum in CameraManufacturer - for now, you can choose which manufacturer you want to use - in reality the decision could be made by an user (by gathering input from them) or even by configuration.
//  x A takePhotograph() method that calls the takePhotograph() method of the Camera class.
public class Photographer {

    private Camera camera;

    public Photographer(CameraFactory.CameraManufacturer cameraManufacturer) {
        this.camera = CameraFactory.makeCamera(cameraManufacturer);
    }

    public void takePhotograph(double shutterspeed) {
        this.camera.takePhotograph(shutterspeed);
    }
}