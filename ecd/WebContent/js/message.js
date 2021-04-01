function doConfirm(msg, yesFn, noFn) {
    var confirmBox = document.createElement("div");
    confirmBox.innerHTML = "<div id='confirmBox'><div class='message'></div><button class='yes'>Yes</button><button class='no'>No</button></div><button onclick='doConfirm('Are you sure?', function yes(){alert('YEs')}, function no(){alert('no')});'>submit</button>";

    confirmBox.find(".message").text(msg);
    confirmBox
        .find(".yes,.no")
        .unbind()
        .click(function () {
            confirmBox.hide();
        });
    confirmBox.find(".yes").click(yesFn);
    confirmBox.find(".no").click(noFn);
    confirmBox.show();
}
