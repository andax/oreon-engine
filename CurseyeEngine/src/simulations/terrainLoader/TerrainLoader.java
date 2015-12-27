package simulations.terrainLoader;

import engine.gui.GUI;
import engine.gui.GUIs.EngineGUI;
import engine.lighting.DirectionalLight;
import engine.main.CoreEngine;
import engine.main.RenderingEngine;
import engine.math.Vec3f;
import simulations.templates.Simulation;
import simulations.templates.TerrainSimulation;

public class TerrainLoader extends TerrainSimulation{
	
	public static void main(String[] args) {
		Simulation simulation = new TerrainLoader();
		GUI gui = new EngineGUI();
		CoreEngine coreEngine = new CoreEngine(1080, 640, "TerrainLoader", simulation, gui);
		coreEngine.createWindow();
		coreEngine.start();
	}

	public void init()
	{	
		super.init();
		setTerrain(new Terrain());
		setWater(new Ocean());
		RenderingEngine.setDirectionalLight(new DirectionalLight(new Vec3f(0,-1,0), new Vec3f(1.0f,1.0f,1.0f), new Vec3f(1.0f, 0.97f, 0.85f), 0.9f));
	}
}