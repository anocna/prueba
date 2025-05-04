package test;

import negocio.EmpleadoABM;

public class TestTraerTicketAsociado {
	
	public static void main(String[] args) {
		
		EmpleadoABM empleadoAbm = new EmpleadoABM();
		
		try {
			System.out.println(empleadoAbm.traerEmpleado(1).getTicketAsignado());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
