package apiDoctor.builder;
import apiDoctor.*;

public class DoctorBuilder {


		private Doctor doctor;

		public DoctorBuilder(int id, String speciality) {
			doctor = new Doctor(id,speciality);
		}
		public DoctorBuilder appointmen(Appointmen appointmen){
			
			doctor.addApoiment(appointmen);
			
			return this;
		}

		public DoctorBuilder id(int id) {
			doctor.setId(id);
			return this;
		}
		
		public DoctorBuilder speciality(String speciality){
			doctor.setSpeciality(speciality);
			return this;
		}
		public DoctorBuilder cost(double cost){
			doctor.setCost(cost);
			return this;
		}
		
		public DoctorBuilder level(Level level){
			doctor.setLevel(level);
			return this;
		}
		
		public Doctor build(){
			return this.doctor;
		}
}
