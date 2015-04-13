ALTER TABLE "system$image"
	ADD "submetaobjectname" VARCHAR_IGNORECASE(255) NULL;
UPDATE "system$image"
 SET "submetaobjectname" = 'System.Image';
CREATE INDEX "idx_system$image_submetaobjectname" ON "system$image"
	("submetaobjectname","id");
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('272f49fe-6a64-3ede-a32d-344a34e57b9f', 
'37827192-315d-4ab6-85b8-f626f866ea76', 
'submetaobjectname', 
'submetaobjectname', 
30, 
255, 
'System.Image', 
false);
INSERT INTO "mendixsystem$index" ("id", 
"table_id", 
"index_name")
 VALUES ('00a9ec1c-4fab-368f-83d4-ffa8ff501c8c', 
'37827192-315d-4ab6-85b8-f626f866ea76', 
'idx_system$image_submetaobjectname');
INSERT INTO "mendixsystem$index_column" ("index_id", 
"column_id", 
"sort_order", 
"ordinal")
 VALUES ('00a9ec1c-4fab-368f-83d4-ffa8ff501c8c', 
'272f49fe-6a64-3ede-a32d-344a34e57b9f', 
false, 
0);
CREATE TABLE "mobilenotes$images" (
	"id" BIGINT NOT NULL,
	PRIMARY KEY("id"));
INSERT INTO "mendixsystem$entity" ("id", 
"entity_name", 
"table_name", 
"superentity_id")
 VALUES ('2b875f69-b01a-4e07-a0a0-9efaffd102ca', 
'MobileNotes.Images', 
'mobilenotes$images', 
'37827192-315d-4ab6-85b8-f626f866ea76');
CREATE TABLE "mobilenotes$images_notes" (
	"mobilenotes$imagesid" BIGINT NOT NULL,
	"mobilenotes$notesid" BIGINT NOT NULL,
	PRIMARY KEY("mobilenotes$imagesid","mobilenotes$notesid"));
CREATE INDEX "idx_mobilenotes$images_notes_mobilenotes$notes_mobilenotes$images" ON "mobilenotes$images_notes"
	("mobilenotes$notesid","mobilenotes$imagesid");
INSERT INTO "mendixsystem$association" ("id", 
"association_name", 
"table_name", 
"parent_entity_id", 
"child_entity_id", 
"parent_column_name", 
"child_column_name", 
"index_name")
 VALUES ('c57128d3-8b7e-47ff-8272-3569b298fac1', 
'MobileNotes.Images_Notes', 
'mobilenotes$images_notes', 
'2b875f69-b01a-4e07-a0a0-9efaffd102ca', 
'42bd11f1-5151-49e2-9304-0ce60f56e83b', 
'mobilenotes$imagesid', 
'mobilenotes$notesid', 
'idx_mobilenotes$images_notes_mobilenotes$notes_mobilenotes$images');
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.0.7', 
"lastsyncdate" = '20150413 21:39:22';
