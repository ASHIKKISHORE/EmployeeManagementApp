<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>
<br><br>
<center>
	<fieldset style="width: 500px">
		<h1 style="color: blue; text-align: center">Employee Salary Slip
			Form</h1>
		<hr>
		<frm:form modelAttribute="stud">
			<table align="center">
				<tr>
					<td>Student No</td>
					<td><input type="text" name="sno"></td><br>
				</tr>
				<tr>
					<td>Student Name</td>
					<td><input type="text" name="sname"></td>
				</tr>
				<tr>
					<td>Student Address</td>
					<td><input type="text" name="saddrs"></td>
				</tr>
				<tr>
					<td>Student Average</td>
					<td><input type="text" name="savg"></td>
				</tr>
				
				<tr>
					<td colspan="2"><input type="submit" value="Register" style="float: right;color: white;background-color: green;padding: 6px;border-radius: 5px;border: 1px;"></td>
				</tr>
			</table>
		</frm:form>
	</fieldset>
</center>
