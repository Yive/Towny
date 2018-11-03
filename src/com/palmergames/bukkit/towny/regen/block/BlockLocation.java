package com.palmergames.bukkit.towny.regen.block;

import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.World;

/**
 * A class to hold basic block location data
 * 
 * @author ElgarL
 */
public class BlockLocation {

	public void setY(int y) {

		this.y = y;
	}

	protected int x, z, y;
	protected Chunk chunk;
	protected World world;

	public BlockLocation(Location loc) {

		this.x = loc.getBlockX();
		this.z = loc.getBlockZ();
		this.y = loc.getBlockY();
		this.chunk = loc.getChunk();
		this.world = loc.getWorld();
	}

	public Chunk getChunk() {

		return chunk;
	}
	
	public int getX() {

		return x;
	}

	public int getZ() {

		return z;
	}

	public int getY() {

		return y;
	}

	public World getWorld() {

		return world;
	}

	public boolean isLocation(Location loc) {
		return (loc.getWorld() == getWorld()) && (loc.getBlockX() == getX()) && (loc.getBlockY() == getY()) && (loc.getBlockZ() == getZ());
	}

//	public boolean isLocation(BlockLocation blockLocation) {
//
//		if ((blockLocation.getWorld() == getWorld()) && (blockLocation.getX() == getX()) && (blockLocation.getY() == getY()) && (blockLocation.getZ() == getZ()))
//			return true;
//
//		return false;
//	}

}
