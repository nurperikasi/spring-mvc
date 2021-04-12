package web.sevice;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Override
    public List<Car> getCarCount(Integer count) {

        if (count == null) {
            count = 0;
        }
        List<Car> carList = new ArrayList<>();

        carList.add(new Car(1, "model1", "green"));
        carList.add(new Car(2, "model2", "black"));
        carList.add(new Car(3, "model3", "yellow"));
        carList.add(new Car(4, "model4", "white"));
        carList.add(new Car(5, "model5", "purple"));

            switch (count) {
                case 1:
                    carList = carList.subList(0, 1);
                    break;
                case 2:
                    carList = carList.subList(0, 2);
                    break;
                case 3:
                    carList = carList.subList(0, 3);
                    break;
                case 4:
                    carList = carList.subList(0, 4);
                    break;
                default:
                    break;
            }
        return carList;
    }
}