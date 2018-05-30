<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://www.springframework.org/tags/form" prefix="mvc" %>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Scheduling Page</title>
    <link href="Styles/Styler.css" rel="stylesheet" type="text/css" />
    <style>
        td input {
            width: 90%;
            margin: 0 auto;
        }

        #addForm.offScreen{
        z-index:2;
            width:100%;
            height: 800px;
            top:10%;
            position:fixed;
            transition:all 1s;
            right:-100%;
        }
        #addForm form{
            width: 50%;
            overflow:auto;
            margin: 0 auto;
            background-color:white;
            border:thin solid black;
        }
        
        #addForm form p{
        float:right;
        padding:8px;
        padding-right:20%;
        }


        .onScreen{
            right: 0% !important;
        }
    </style>
</head>
<body>
    <div id="wrapper">
        <img class="headerImage" src="Images/headerlogo-full.jpg" alt="HeaderImage" />
        <table style="margin:0 auto; width:90%;" border="0">
            <tr>
                <th>Date</th>
                <th>Start Time</th>
                <th>End Time</th>
                <th>Event</th>
                <th>Description</th>
                <th>Address</th>
                <th></th>
            </tr>

            <c:forEach items="${events}" var="evnt">
                <tr id="${evnt.getEvent_ID()}">
                    <!-- We can tell which event id we are looking at -->
                    <mvc:form modelAttribute="event" action="edit.mvc" id="${evnt.getEvent_ID() }form">
                        <mvc:input type="hidden" path="pass" value="${evnt.getPass()}" />
                        <mvc:input type="hidden" path="user" value="${evnt.getUser()}" />
                        <mvc:input type="hidden" path="event_ID" value="${evnt.getEvent_ID() }" />
                        <mvc:input type="hidden" path="user_ID" value="${evnt.getUser_ID() }" />
                        <mvc:input type="hidden" path="saved" value="${evnt.getSaved() }" />
                        <td><mvc:input placeholder="dd/mm/yyyy" path="eventDate" value="${ evnt.getEventDate().toString()}" onchange="showSave(this)" /></td>
                        <td><mvc:input path="eventStartTime" value="${ evnt.getEventStartTime().toString()}" onchange="showSave(this)" /></td>
                        <td><mvc:input path="eventEndTime" value="${ evnt.getEventEndTime().toString()}" onchange="showSave(this)" /></td>
                        <td><mvc:input path="eventDescription" value="${ evnt.getEventDescription()}" onchange="showSave(this)" /></td>
                        <td><mvc:input path="eventName" value="${ evnt.getEventName()}" onchange="showSave(this)" /></td>
                        <td><mvc:input path="eventAddress" value="${ evnt.getEventAddress()}" onchange="showSave(this)" /></td>
                        <td><input id="${ evnt.getEvent_ID()}save" style="display:none" type="submit" value="Save"></td>
                        <td><input id="${ evnt.getEvent_ID() }del" value="X" style="border: thin solid black;" type="button" onclick="delButtClick(this)" /></td>
                    </mvc:form>
                </tr>
            </c:forEach>
        </table>
        <center><input type="button" onclick="addButtonClicked()" value="Add an Event" style="width:200px; margin: 0 auto;"/></center>

        <div id="addForm" class="offScreen">
        
            <mvc:form modelAttribute="event" action="addEvent.mvc" id="newform">
            <input type="button" style="float:right background-color:red;" value="X" onclick="cancelAddEvent()">
        	<center>New Event</center>
                        <mvc:input type="hidden" path="pass" value="${newEvent.getPass()}" />
                        <mvc:input type="hidden" path="user" value="${newEvent.getUser()}" />
                        <mvc:input type="hidden" path="user_ID" value="${newEvent.getUser_ID() }" />
                        <mvc:input type="hidden" path="saved" value="" />
                        <p>
                        <label>Date:</label>
                        <mvc:input placeholder="dd/mm/yyyy" path="eventDate" value="${ evnt.getEventDate().toString()}" /></p>
                        
                        <p>
                        <label>Start Time:</label>
                        <mvc:input path="eventStartTime" value="${ evnt.getEventStartTime().toString()}"/></p>
                        <p>
                        <label>End Time:</label>
                        <mvc:input path="eventEndTime" value="${ evnt.getEventEndTime().toString()}"/></p>
           
                        <p>
                        <label>Description:</label>
                        <mvc:input path="eventDescription" value="${ evnt.getEventDescription()}"  /></p>
                        
                        <p>
                        <label>Event Name:</label>
                        <mvc:input path="eventName" value="${ evnt.getEventName()}"  />
                        
                        <p>
                        <label>Address:</label>
                        <mvc:input path="eventAddress" value="${ evnt.getEventAddress()}"/>
                        
                        <p style="clear:both; margin: 0 auto;">
                        
                        <input id="${ evnt.getEvent_ID()}save"  type="submit" value="Save">
                        </p>
                       
                    </mvc:form>
        </div>
        
        <h5 class="transparent">Property of SuperScheduler Studios�</h5>
    </div>
    <script>
    var addForm = document.getElementById("addForm");
        function addButtonClicked() {
           addForm.classList.add("onScreen");
        }
        
        function cancelAddEvent(){
        	addForm.classList.remove("onScreen");
        }

var errMsg = "${error.getErrMsg()}";
var errElem;
if (errMsg != null || errMsg != ""){
	errElem = document.getElementById(errMsg);
	errElem.style = "border:thin red solid; background-color:red;";
}

function delButtClick(elem){
	var formID = elem.id.slice(0,-3) + "form"; // Cut out the del part.
	var form = document.getElementById(formID); // Get the form.
	
	form.action = "delete.mvc"; // Change the action to delete.
	form.submit();
}

function showSave(elem) {
    var par = elem.parentElement.parentElement;
    var button = document.getElementById(par.id + "save");
	par
    button.style = "display:normal;";
}
    </script>
</body>

</html>