package water.api.schemas3;

import hex.ModelMetricsRegressionGLM;
import water.api.API;
import water.api.API.Direction;

/**
 */
public class ModelMetricsRegressionGLMV3 extends ModelMetricsRegressionV3<ModelMetricsRegressionGLM, ModelMetricsRegressionGLMV3> {

  @API(help = "residual deviance", direction = Direction.OUTPUT)
  public double residual_deviance;

  @API(help = "null deviance", direction = Direction.OUTPUT)
  public double null_deviance;

  @API(help = "AIC", direction = Direction.OUTPUT)
  public double AIC;

  @API(help = "R^2", direction = Direction.OUTPUT)
  public double r2;

  @API(help="null DOF", direction= Direction.OUTPUT)
  public long null_degrees_of_freedom;

  @API(help="residual DOF", direction= Direction.OUTPUT)
  public long residual_degrees_of_freedom;


  @Override
  public ModelMetricsRegressionGLMV3 fillFromImpl(ModelMetricsRegressionGLM modelMetrics) {
    super.fillFromImpl(modelMetrics);
    this.AIC = modelMetrics._AIC;
    this.r2 = modelMetrics._r2;
    this.residual_deviance = modelMetrics._resDev;
    this.null_deviance = modelMetrics._nullDev;
    this.null_degrees_of_freedom = modelMetrics._nullDegressOfFreedom;
    this.residual_degrees_of_freedom = modelMetrics._residualDegressOfFreedom;
    return this;
  }

}
