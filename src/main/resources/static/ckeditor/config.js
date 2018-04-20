/**
 * Copyright (c) 2003-2017, CKSource - Frederico Knabben. All rights reserved.
 * For licensing, see LICENSE.md or http://ckeditor.com/license
 */

CKEDITOR.editorConfig = function( config ) {

	config.extraPlugins = 'uploadimage,filebrowser';
	// Define changes to default configuration here. For example:
	// config.language = 'fr';
	// config.uiColor = '#AADC6E';

	// Save images to Qiniu or Ali OSS. If seted saveto, must be set: BucketDomain
	config.saveto = 'qiniu';
	config.BucketDomain = 'http://p76buwmyf.bkt.clouddn.com';
	config.UploadDomain = 'http://up-z2.qiniup.com';
	config.PluploadFlashSwfUrl = 'plupload/js/plupload_flash_Moxie.swf';

	// Images use lazyload. If seted lazyload, must be set: lazyloadattribute, config.extraAllowedContent
	// config.lazyload = true;
	config.lazyloadImg = '/skin/images/logo.png';
	config.lazyloadAttribute = 'data-original';
	config.lazyloadCss = 'lazy';
	config.extraAllowedContent = 'img[data-original]';

	config.autoParagraph = false;
	config.enterMode = CKEDITOR.ENTER_BR;
	config.shiftEnterMode = CKEDITOR.ENTER_P;
	
	config.toolbarGroups = [
		{ name: 'document', groups: [ 'mode', 'document', 'doctools' ] },
		{ name: 'clipboard', groups: [ 'clipboard', 'undo' ] },
		{ name: 'editing', groups: [ 'find', 'selection', 'spellchecker', 'editing' ] },
		{ name: 'forms', groups: [ 'forms' ] },
		{ name: 'basicstyles', groups: [ 'basicstyles', 'cleanup' ] },
		{ name: 'paragraph', groups: [ 'list', 'indent', 'blocks', 'align', 'bidi', 'paragraph' ] },
		{ name: 'links', groups: [ 'links' ] },
		{ name: 'insert', groups: [ 'insert' ] },
		{ name: 'styles', groups: [ 'styles' ] },
		{ name: 'colors', groups: [ 'colors' ] },
		{ name: 'tools', groups: [ 'tools' ] },
		{ name: 'others', groups: [ 'others' ] },
		{ name: 'about', groups: [ 'about' ] }
		];

		config.removeButtons = 'Source,Save,NewPage,Preview,Print,Templates,Copy,PasteFromWord,Find,Replace,SelectAll,Form,Radio,TextField,Textarea,Select,ImageButton,HiddenField,Button,Checkbox,Subscript,Superscript,Strike,Underline,RemoveFormat,CreateDiv,Blockquote,Language,Anchor,CodeSnippet,Flash,Smiley,SpecialChar,PageBreak,Iframe,Code,BGColor,Styles,ShowBlocks,Maximize,Cut';
				
	
	
};