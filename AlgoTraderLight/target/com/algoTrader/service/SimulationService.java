// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: SpringService.vsl in andromda-spring-cartridge.
//
package com.algoTrader.service;

/**
 * 
 */
public interface SimulationService {
	
	/**
     * 
     */
	public void resetDB();
	
	/**
     * 
     */
	public void inputCSV();
	
	/**
     * 
     */
	public com.algoTrader.vo.SimulationResultVO runByUnderlayings();
	
	/**
     * 
     */
	public void simulateWithCurrentParams();
	
	/**
     * 
     */
	public com.algoTrader.vo.SimulationResultVO getSimulationResultVO(
	        long startTime);
	
}
