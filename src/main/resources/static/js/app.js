$(document).ready(function() {
	$('#contacts').DataTable({
		"columnDefs": [{
			"targets": 'no-sort',
			"orderable": false,
		}]
	});
});