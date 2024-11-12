public interface IVehicleInspector {
  int visit(Car car);
  int visit(Motorbike motorbike);
  int visit(Van van);
}
