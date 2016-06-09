console.log 'start app...', Date.now()
fw7 = new Framework7(
  modalTitle: 'Framework7'
  material: true
)
$$ = Dom7
mainView = fw7.addView('.view-main', {})

$("a#fib_submit").on "click", (e) ->
  method = $("input[name=fib_method]:checked").val()
  value = $("input#fib_value").val()
  console.log "Send request =>", {method, value}
  request = $.get "/api/v1/fibonacci/#{method}/#{value}"
  request.done (data, statusText, xhr) ->
    console.log "Response success => ", data
    $("#response_header").text("OK")
    $("#response_request").text("GET /api/v1/fibonacci/#{method}/#{value}")
    $("#response_status").text(xhr.status)
    $("#response_result").val(data)
    fw7.popup(".response-popup")
  request.error (err) ->
    console.error "Response error =>", err
    $("#response_header").text("ERROR")
    $("#response_request").text("GET /api/v1/fibonacci/#{method}/#{value}")
    $("#response_status").text(err.status)
    $("#response_result").val(err.responseText)
    fw7.popup(".response-popup")